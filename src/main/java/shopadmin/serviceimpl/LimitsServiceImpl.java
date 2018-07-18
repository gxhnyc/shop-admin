package shopadmin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.entity.Limits;
import shopadmin.mapper.LimitsMapper;
import shopadmin.service.LimitsService;

@Service
public class LimitsServiceImpl implements LimitsService {
	private LimitsMapper limitsMapper;
	
	@Autowired
	public LimitsServiceImpl(LimitsMapper limitsMapper) {
		super();
		this.limitsMapper = limitsMapper;
	}

	/**
	 * 查找所有权限
	 */
	@Override
	public List<Limits> findAllOptions() {
		
		return limitsMapper.findAllOptions();
	}

}
