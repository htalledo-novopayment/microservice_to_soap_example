package com.mdelacruz.ejemplo.service;

import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR091001Response;

public interface GQ091001Service {
    public GR091001Response getGR091001Response(GQ091001Request request);
}
