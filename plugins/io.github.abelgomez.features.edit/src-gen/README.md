## NOTE

It is not possible to override the default _ItemProviderAdapterFactory_ generated for a metamodel: references to it are hardcoded in the generated code in several parts (specially in the editors).
To avoid having to modify all references to it, generated code of the default _ItemProviderAdapterFactory_ (i.e., _FeaturesItemProviderAdapterFactory_) must be manually modified when custom behaviour is desired.
To minimize modifications, we override the _FeaturesItemProviderAdapterFactory_ implementation to provide custom _ItemProviders_ extending the default ones.
To keep track of all modified and manually coded files, we have moved all of them from `src-gen` to `src`.
As a consequence, some files may appear duplicated both in the `src` and `src-gen` directories when regenerating code.
In that case, simply remove the duplicate files in the packages under `src-gen`.