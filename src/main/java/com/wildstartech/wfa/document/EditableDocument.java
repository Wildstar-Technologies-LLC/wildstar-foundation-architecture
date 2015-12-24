package com.wildstartech.wfa.document;

import java.io.OutputStream;

public interface EditableDocument extends Document {
   /**
    * Provides stream-based access to update the content of the document.
    */
   public OutputStream getOutputStream();
}
