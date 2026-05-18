import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DefaultPageLayout } from './default-page-layout';

describe('DefaultPageLayout', () => {
  let component: DefaultPageLayout;
  let fixture: ComponentFixture<DefaultPageLayout>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DefaultPageLayout]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DefaultPageLayout);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
