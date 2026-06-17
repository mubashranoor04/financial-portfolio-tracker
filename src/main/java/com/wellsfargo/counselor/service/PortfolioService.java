@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public Portfolio savePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }
}