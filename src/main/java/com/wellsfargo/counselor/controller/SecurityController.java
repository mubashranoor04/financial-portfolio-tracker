@RestController
@RequestMapping("/securities")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @PostMapping
    public Security createSecurity(@RequestBody Security security) {
        return securityService.saveSecurity(security);
    }

    @GetMapping
    public List<Security> getAllSecurities() {
        return securityService.getAllSecurities();
    }
}