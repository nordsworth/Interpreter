package interpreter.bytecode;

import interpreter.VirtualMachine;

public class HaltCode extends ByteCode {
    public void init(String a, String b) {
        // no initialization needed //
    }

    public void execute(VirtualMachine vm) {
        vm.clearStack();
        vm.toggle();
    }

    public String toString() {
        return "HALT ";
    }
}
