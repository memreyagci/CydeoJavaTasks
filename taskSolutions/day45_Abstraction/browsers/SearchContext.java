package day45_Abstraction.browsers;

public interface SearchContext {
    void findElement(String locator);

    void findElements(String locators);
}
