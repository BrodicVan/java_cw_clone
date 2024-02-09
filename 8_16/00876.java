/**
	 * Returns the '<em><b>Book Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
	 * @generated
	 */
public static BookCategory getByName(String name){
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}