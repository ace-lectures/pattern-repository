BACKENDS = ../../asciidoctor-backends
PATTERN = $(notdir $(CURDIR))

slides.html: slides.adoc uml/*.puml
	echo $(PATTERN)
	asciidoctor \
		-T $(BACKENDS)/slim/dzslides \
		-E slim \
		-r asciidoctor-diagram \
		-a pattern=$(PATTERN) \
		slides.adoc 