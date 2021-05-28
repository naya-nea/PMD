package com.anastasianesterova.lab3.ui.list

interface IDataHolder<T> {
    fun setOnClickListener(listener: OnItemClickListener<T>?)
    fun bind(item: T)
    fun getItem(): T?
}