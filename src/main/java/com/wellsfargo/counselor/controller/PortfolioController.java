@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.savePortfolio(portfolio);
    }

    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return portfolioService.getAllPortfolios();
    }
}