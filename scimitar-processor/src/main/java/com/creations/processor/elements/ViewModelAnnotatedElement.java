package com.creations.processor.elements;

import javax.lang.model.element.Element;

public class ViewModelAnnotatedElement extends AnnotatedElement {

    public ViewModelAnnotatedElement(Element element) {
        super(element);
    }

    // Just using an hack to get the Class type
    /*private static TypeMirror getValue(ViewModel annotation) {
        try {
            annotation.value();
        } catch (MirroredTypeException mte) {
            return mte.getTypeMirror();
        }
        return null;
    }*/


}
