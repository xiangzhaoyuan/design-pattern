package com.xzy.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚合对象
 * Created by Administrator on 2017/12/30.
 */
public class ConcreteAggregate {

    private List<Object> list = new ArrayList<Object>();

    public void addObject(Object object) {
        this.list.add(object);
    }

    public void removeObject(Object object) {
        this.list.remove(object);
    }

    public ConcreteIterator createIterator(){
        return new ConcreteIterator();
    }

    //使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements Iterator {

        //使用游标用于记录遍历时的位置
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size();
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
