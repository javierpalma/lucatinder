import { TestBed } from '@angular/core/testing';

import { PerfilServiciosService } from './perfil-servicios.service';

describe('PerfilServiciosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PerfilServiciosService = TestBed.get(PerfilServiciosService);
    expect(service).toBeTruthy();
  });
});
