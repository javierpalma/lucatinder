import { TestBed } from '@angular/core/testing';

import { ServiciosPerfilService } from './servicios-perfil.service';

describe('ServiciosPerfilService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiciosPerfilService = TestBed.get(ServiciosPerfilService);
    expect(service).toBeTruthy();
  });
});
