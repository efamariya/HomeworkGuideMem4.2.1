package com.example.homeworkguidemem421;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    // неизменяемые поля адаптера
    private final LayoutInflater inflater; // поле для трансформации Layout-файла в View-элемент
    private final List<Animal> animals; // поле коллекции контейнера для хранения данных(оъектов класса Animal)

    // конструктор адаптера

    public Adapter(Context context, List<Animal> animals) {
        this.inflater = LayoutInflater.from(context);
        this.animals = animals;
    }

    // метод onCreateViewHolder() возвращает объекты ViewHolder(), который будет хранить данные по одному оъекту Animal
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла в View-элемент
        return new ViewHolder(view);
    }
    // метод onBindViewHolder() выполняет привязку объекта ViewHolder(), который будет хранить данные по одному оъекту Animal
    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.imageView.setImageResource(animal.getAnimalResourse());
        holder.textView3.setText(animal.getNeme());
        holder.textView4.setText(animal.getDiscription());
    }

    // метод getItemCount() возращает количество объектов в списке
    @Override
    public int getItemCount() {
        return animals.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView imageView;
        final TextView textView3, textView4;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            textView3 = view.findViewById(R.id.textView3);
            textView4 = view.findViewById(R.id.textView4);
        }
    }
}
