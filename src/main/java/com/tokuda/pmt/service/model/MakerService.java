package com.tokuda.pmt.service.model;

import com.tokuda.pmt.entity.MakerEntity;
import com.tokuda.pmt.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerService {

    private final MakerRepository makerRepository;

    @Autowired
    public MakerService(MakerRepository makerRepository) {
        this.makerRepository = makerRepository;
    }

    public List<MakerEntity> findAll(){
        return makerRepository.findAll();
    }

    public Optional<MakerEntity> findById(int id){
        return makerRepository.findById(id);
    }

    public void save(MakerEntity makerEntity){
        makerRepository.saveAndFlush(makerEntity);
    }

    public void update(MakerEntity makerEntity){
        makerRepository.saveAndFlush(makerEntity);
    }

    public void delete(MakerEntity makerEntity){
        makerRepository.delete(makerEntity);
    }

    public Page<MakerEntity> getPage(int pageNumber, int pageSize){
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize, Sort.Direction.ASC, "id");
        Page<MakerEntity> page = makerRepository.findAll(pageRequest);
        return page;
    }
}
