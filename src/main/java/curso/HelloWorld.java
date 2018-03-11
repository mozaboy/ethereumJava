package curso;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class HelloWorld extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b60028054600160a060020a03191633600160a060020a0316179055610542806100396000396000f3006060604052600436106100825763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630d588ae981146100875780630f57b4a1146101115780631034ff8a1461012f57806341c0e1b5146101425780637e34a423146101575780639d7f02e41461016a578063c7df002814610175575b600080fd5b341561009257600080fd5b61009a6101c6565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156100d65780820151838201526020016100be565b50505050905090810190601f1680156101035780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b610119610264565b60405160ff909116815260200160405180910390f35b341561013a57600080fd5b61009a610281565b341561014d57600080fd5b610155610289565b005b341561016257600080fd5b61009a6102ca565b61009a600435610372565b341561018057600080fd5b61015560046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061045595505050505050565b60018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561025c5780601f106102315761010080835404028352916020019161025c565b820191906000526020600020905b81548152906001019060200180831161023f57829003601f168201915b505050505081565b6000670de0b6b3a7640000341461027a57600080fd5b5060015b90565b61027e61046c565b6002543373ffffffffffffffffffffffffffffffffffffffff908116911614156102c85760025473ffffffffffffffffffffffffffffffffffffffff16ff5b565b6102d261046c565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103685780601f1061033d57610100808354040283529160200191610368565b820191906000526020600020905b81548152906001019060200180831161034b57829003601f168201915b5050505050905090565b61037a61046c565b6000670de0b6b3a7640000341461039057600080fd5b82600114156104185750670de0b6b3a764000073ffffffffffffffffffffffffffffffffffffffff3316600082604051600060405180830381858888f1935050505015156103dd57600080fd5b6040805190810160405260208082527f7061726162656e7320766f63652061636572746f75206f206e756d65726f203190820152915061044f565b60408051908101604052600f81527f74656e7465206f757472612076657a0000000000000000000000000000000000602082015291505b50919050565b600081805161046892916020019061047e565b5050565b60206040519081016040526000815290565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106104bf57805160ff19168380011785556104ec565b828001600101855582156104ec579182015b828111156104ec5782518255916020019190600101906104d1565b506104f89291506104fc565b5090565b61027e91905b808211156104f857600081556001016105025600a165627a7a723058209b92149dc107d027d675e82ced23e03c65c5edaaf6c32355872a92c0d5d6dffd0029";

    protected HelloWorld(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HelloWorld(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> sobreNome() {
        Function function = new Function("sobreNome", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setSobreNome(BigInteger weiValue) {
        Function function = new Function(
                "setSobreNome", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<String> getSobreNome() {
        Function function = new Function("getSobreNome", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> kill() {
        Function function = new Function(
                "kill", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getNome() {
        Function function = new Function("getNome", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> sorteio(BigInteger numeroDaSorte, BigInteger weiValue) {
        Function function = new Function(
                "sorteio", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(numeroDaSorte)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<TransactionReceipt> setNome(String _nome) {
        Function function = new Function(
                "setNome", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_nome)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<HelloWorld> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HelloWorld.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<HelloWorld> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HelloWorld.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static HelloWorld load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorld(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static HelloWorld load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorld(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
