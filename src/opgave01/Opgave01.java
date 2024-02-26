package opgave01;

import opgave01.models.Vault;

public class Opgave01 {
    public static void main(String[] args) {
        Vault<Integer> integerVault = new Vault<Integer>(42, "My password");
        Integer secret = integerVault.getSecret("My Password");
        System.out.println(integerVault.getSecret("My password"));

        Vault<String> anotherVault= new Vault<String>("42", "My password");
        String anotherSecret= anotherVault.getSecret("My password");
        System.out.println(anotherVault.getSecret("fisk"));
    }
}
