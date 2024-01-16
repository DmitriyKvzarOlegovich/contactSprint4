package ru.yandex.practicum.contacts.presentation.base;

import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.sort.SortTypeUI;

public class BaseListDiffCallback<T extends ListDiffInterface<T> > extends DiffUtil.ItemCallback<T> {

    @Override

    public boolean areItemsTheSame( T oldItem, T newIt) {

        return oldItem.theSameAs(newIt);
    }

    @Override

    public boolean areContentsTheSame(T oldItem, T newItem) {
        return oldItem.equals(newItem);
    }

    //@Nullable
    @Override

    public Object getChangePayload(T oldItem, T newItem) {
        return newItem;
    }
}
