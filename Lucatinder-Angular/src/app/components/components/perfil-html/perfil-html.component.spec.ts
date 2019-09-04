import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilHTMLComponent } from './perfil-html.component';

describe('PerfilHTMLComponent', () => {
  let component: PerfilHTMLComponent;
  let fixture: ComponentFixture<PerfilHTMLComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilHTMLComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilHTMLComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
