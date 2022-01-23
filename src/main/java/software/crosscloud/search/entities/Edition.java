package software.crosscloud.search.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Edition {

    @Id
    private String key;
    /**
     *
     * (Required)
     *
     */
    private String title;
    private String subtitle;
    /**
     *
     * (Required)
     *
     */
    @DBRef
    private List<Author> authors = new ArrayList<Author>();
    /**
     *
     * (Required)
     *
     */
    @Indexed(name="isbn10_i")
    private List<String> isbn10 = new ArrayList<String>();
    @Indexed(name="isbn13_i")
    private List<String> isbn13 = new ArrayList<String>();
    /**
     * Library of Congress Control Numbers
     * <p>
     * Library of Congress Control Numbers, linkable via https://lccn.loc.gov/<lccn>
     *
     */
    private List<String> lccn = new ArrayList<String>();
    /**
     * Internet Archive OCAID
     * <p>
     * Links to the Internet Archive record via https://archive.org/details/<ocaid>
     *
     */
    private String ocaid;
    /**
     * OCLC Online Computer Library Center / WorldCat id, linkable via https://www.worldcat.org/oclc/<oclc_number>
     *
     */
    private List<String> oclcNumbers = new ArrayList<String>();
    private List<Double> covers = new ArrayList<Double>();
    private String byStatement;
    private String weight;
    private String editionName;
    private Double numberOfPages;
    private String pagination;
    private String physicalDimensions;
    private String physicalFormat;
    /**
     * The MARC21 country code. See https://www.loc.gov/marc/countries/cou_home.html
     *
     */
    private String publishCountry;
    private String publishDate;
    private List<String> publishPlaces = new ArrayList<String>();
    private List<String> publishers = new ArrayList<String>();
    private List<String> contributions = new ArrayList<String>();
    private List<String> deweyDecimalClass = new ArrayList<String>();
    private List<String> genres = new ArrayList<String>();
    private List<String> lcClassifications = new ArrayList<String>();
    private List<String> otherTitles = new ArrayList<String>();
    private List<String> series = new ArrayList<String>();
    private List<String> sourceRecords = new ArrayList<String>();
    private List<String> subjects = new ArrayList<String>();
    private List<String> workTitles = new ArrayList<String>();
    private List<Object> tableOfContents = new ArrayList<Object>();
    private String description;
    private String firstSentence;
    private String notes;
    /**
     *
     * (Required)
     *
     */
    private Double revision;
    private Double latestRevision;
    private Instant created;
    /**
     *
     * (Required)
     *
     */
    private Instant lastModified;


}
