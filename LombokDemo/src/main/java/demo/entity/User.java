package demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class User {
    @NonNull
    private String userId;
    private String userName;
    private Long userContactNumber;
    @NonNull
    private List<Address> addressList;
}
