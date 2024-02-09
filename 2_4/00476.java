/** Build a rotation from three Cardan or Euler elementary rotations.

 * <p>Cardan rotations are three successive rotations around the
 * canonical axes X, Y and Z, each axis beeing used once. There are
 * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler
 * rotations are three successive rotations around the canonical
 * axes X, Y and Z, the first and last rotations beeing around the
 * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,
 * YZY, ZXZ and ZYZ), the most popular one being ZXZ.</p>
 * <p>Beware that many people routinely use the term Euler angles even
 * for what really are Cardan angles (this confusion is especially
 * widespread in the aerospace business where Roll, Pitch and Yaw angles
 * are often wrongly tagged as Euler angles).</p>

 * @param order order of rotations to use
 * @param alpha1 angle of the first elementary rotation
 * @param alpha2 angle of the second elementary rotation
 * @param alpha3 angle of the third elementary rotation
 */
public Rotation(RotationOrder order,
                double alpha1, double alpha2, double alpha3){
  Rotation r1 = new Rotation(order.getA1(), alpha1);
  Rotation r2 = new Rotation(order.getA2(), alpha2);
  Rotation r3 = new Rotation(order.getA3(), alpha3);
  Rotation composed = r1.applyTo(r2.applyTo(r3));
  q0 = composed.q0;
  q1 = composed.q1;
  q2 = composed.q2;
  q3 = composed.q3;
}