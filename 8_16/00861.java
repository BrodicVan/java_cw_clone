/**
 * Returns the '<em><b>Hb Cascade Type</b></em>' literal with the specified name.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public static HbCascadeType getByName(String name){
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		HbCascadeType result = VALUES_ARRAY[i];
		if (result.getName().equals(name)) {
			return result;
		}
	}
	return null;
}