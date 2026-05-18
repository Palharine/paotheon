package org.pantheon.paotheon.response;

import java.time.Instant;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReceitaResponse{
    
    private Long idReceita;
    private String rating;
    private List<String> categories;
    private Instant publishedAt;
    private Boolean isInToDoList;
}
