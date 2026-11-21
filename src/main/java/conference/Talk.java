package conference;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PACKAGE, force = true)
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public final class Talk {

    @EqualsAndHashCode.Include
    private final String title;

    private final String speaker;

    private final Track track;

    private final int duration;

    private final double rating;

    @ToString.Exclude
    private final Attendee[] attendees;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PACKAGE, force = true)
    @ToString
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public static final class Attendee {

        @EqualsAndHashCode.Include
        private final String email;

        private final String company;

        private final int age;
    }

    public enum Track {
        @JsonProperty("Backend") BACKEND,
        @JsonProperty("Frontend") FRONTEND,
        @JsonProperty("Data") DATA,
        @JsonProperty("Security") SECURITY,
        @JsonProperty("Cloud") CLOUD
    }
}
