package com.jetdev.springdatajpabbl.dto.out;

public interface BookCardView {
    Long getId();

    String getTitle();

    SeriesView getSeries();

    interface SeriesView {
        Long getId();

        String getName();

        EditorView getEditor();

        interface EditorView {
            Long getId();

            String getName();
        }
    }
}
