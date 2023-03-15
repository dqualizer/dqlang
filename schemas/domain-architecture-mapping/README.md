# Domain-Architecture-Mapping 

This schema describes how a Domain-Architecture-Mapping should be structured.
The Mapping will be created in _dqedit_ and stored inside a database.
It will be used by _dqtranslator_ to translate between the subject domain
and technical domain (both directions).

---
### Content:

- Bounded Context
- Server information (host addresses for deployment environments)
- List of objects (actors and Work Objects of Domain Stories)
- Object-IDs
- Object-Names
- Object-Operation-IDs (e.g. Fully-Qualified-Names)
- Object-Types
- Relations to other objects
- Activities (inside of objects)
- Endpoint paths
- Endpoint parametrization
- Expected responses of endpoints