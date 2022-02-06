package com.kelaniya.v7.repository;

import java.io.IOException;

public interface NumberRepository {

    Double[] getNumbers() throws IOException;       // will change this throws part in the future

}
