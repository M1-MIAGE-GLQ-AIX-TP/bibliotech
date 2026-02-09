package fr.amu.univ.miage.m1.glq.service.penalty;

import java.util.Map;
import java.util.Optional;

public class PenaltyPolicyFactory {

  Map<String, PenaltyPolicy> penaltyPolicies =
      Map.of(
          "STUDENT",
          new StudentPenaltyPolicy(),
          "TEACHER",
          new TeacherPenaltyPolicy(),
          "STAFF",
          new StaffPenaltyPolicy());

  public PenaltyPolicy getPolicy(String memberType) {
    Optional<PenaltyPolicy> penaltyPolicy = Optional.ofNullable(penaltyPolicies.get(memberType));
    return penaltyPolicy.orElse(new DefaultPenaltyPolicy());
  }
}
