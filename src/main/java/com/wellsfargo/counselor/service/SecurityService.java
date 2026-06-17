@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public Security saveSecurity(Security security) {
        return securityRepository.save(security);
    }

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }
}