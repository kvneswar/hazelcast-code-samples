package com.hazelcast.examples;

import java.io.Serializable;

@SuppressWarnings("unused")
final class Article implements Serializable {

    private final String name;

    public Article(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
