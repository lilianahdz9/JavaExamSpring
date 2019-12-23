package com.softtek.academia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.entity.State;
import com.softtek.academia.repository.StateRepository;

@Service
@Transactional
public class StateServiceImpl implements StateService {

			private StateRepository repository;
			
			public StateServiceImpl() {
				//contructor
			}
			
			@Autowired
			public StateServiceImpl(StateRepository repository) {
				super();
				this.repository = repository;
			}

		@Override
		public List<State> getAllStates() {
			List<State> list = new ArrayList<State>();
			repository.findAll().forEach(e -> list.add(e));
			return list;
		}

		@Override
		public State getStateById(Long state_id) {
			State state = repository.findById(state_id).get();
			return state;
		}

		@Override
		public boolean saveState(State state) {
			try {
				repository.save(state);
				return true;
			}catch(Exception ex) {
				return false;
			}
		}

		@Override
		public boolean deleteStateById(Long state_id) {
			try {
				repository.deleteById(state_id);
				return true;
			}catch(Exception ex) {
				return false;
			}
			
		}
		

}
