import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Alt1Component } from './alt1.component';

describe('Alt1Component', () => {
  let component: Alt1Component;
  let fixture: ComponentFixture<Alt1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Alt1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Alt1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
