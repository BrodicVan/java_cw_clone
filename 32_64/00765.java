/**
 * Create a new OR specification based on two other spec.
 *
 * @param spec1 Specification one.
 * @param spec2 Specification two.
 */
public OrSpecification(final Specification<T> spec1, final Specification<T> spec2){
  this.spec1 = spec1;
  this.spec2 = spec2;
}