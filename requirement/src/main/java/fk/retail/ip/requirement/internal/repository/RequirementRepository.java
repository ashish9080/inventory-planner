package fk.retail.ip.requirement.internal.repository;

import fk.retail.ip.requirement.internal.entities.Requirement;
import fk.sp.common.extensions.jpa.JpaGenericRepository;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by nidhigupta.m on 15/02/17.
 */
public interface RequirementRepository extends JpaGenericRepository<Requirement, Long> {

    int PAGE_SIZE = 1000;

    List<Requirement> findRequirementByIds(List<Long> requirementIds);

    List<Requirement> findAllCurrentRequirements(String state);

    List<Requirement> findEnabledRequirementsByStateFsn(String state, Collection<String> fsns);

    List<Requirement> find(Collection<String> fsns, boolean enabled);

    List<Requirement> findRequirements(List<Long> projectionIds, String requirementState, Map<String, Object> filters);

    int updateProjection(Collection<Long> projectionIds, String toState);
}
