import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceitasList } from './receitas-list';

describe('ReceitasList', () => {
  let component: ReceitasList;
  let fixture: ComponentFixture<ReceitasList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReceitasList]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReceitasList);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
