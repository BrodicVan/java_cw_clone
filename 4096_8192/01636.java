/**
 * @param orgPersons Organizations per person counts.
 * @param personAccounts Accounts per person counts.
 */
public PutData(Map<Integer, Integer> orgPersons, Map<Object, Integer> personAccounts){
    this.orgPersons = orgPersons;
    this.personAccounts = personAccounts;
}