package nccpl.mts.api.internal.rms.repos;

import nccpl.mts.api.internal.rms.models.FinanceeBrief;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FinanceeBriefRepo extends JpaRepository<FinanceeBrief, Long> {
    Optional<FinanceeBrief> getFinanceeBriefByCmId(String cmId);
}

