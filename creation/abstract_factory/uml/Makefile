.DEFAULT_GOAL := png

PUML = plantuml -charset UTF-8
PNGS = $(patsubst ./%.puml, ./%.png, $(wildcard ./*.puml))
PDFS = $(patsubst ./%.puml, ./%.pdf, $(wildcard ./*.puml))

./%.png: ./%.puml
	$(PUML) ./$<

./%.svg: ./%.puml
	$(PUML) -tsvg ./$<

./%.pdf: ./%.svg
	rsvg-convert -f pdf -o $@ $<

clean:
	rm -rf ./*.png ./*.pdf

testenv:
	$(PUML) -testdot

png: $(PNGS)
pdf: $(PDFS)
