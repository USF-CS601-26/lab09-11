package interfaces.sealed;

// Moveable is a sealed interface
// Java restricts which classes are allowed to implement it:
// only GameCharacter is allowed to directly implement Moveable.
sealed interface Moveable permits GameCharacter {
    void move(int x, int y);
}
