package software.crosscloud.search.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Author implements Comparable<Author> {
    @Id
    private String key;
    /**
     * (Required)
     */
    private String name;


    private List<String> alternateNames = new ArrayList<String>();

    private String birthDate;
    private String deathDate;
    private String location;
    private String date;
    private String entityType;
    private String fullerName;
    private String personalName;

    private String title;

    /**
     * (Required)
     */

    private Double revision;

    private Double latestRevision;

    private Instant created;
    /**
     * (Required)
     */

    private Instant lastModified;


    @Override
    public int compareTo(Author author) {
        return this.key.compareTo(author.key);
    }
}
