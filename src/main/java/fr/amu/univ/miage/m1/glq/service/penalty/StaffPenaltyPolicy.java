package fr.amu.univ.miage.m1.glq.service.penalty;

public class StaffPenaltyPolicy implements PenaltyPolicy {
  @Override
  public double calculatePenalty(int daysOverdue) {
    if (daysOverdue <= 0) {
      return 0;
    }

    double rate;
    double maxPenalty;

    rate = 0.25;
    maxPenalty = 15.0;

    double penalty = daysOverdue * rate;
    return Math.min(penalty, maxPenalty);
  }
}
