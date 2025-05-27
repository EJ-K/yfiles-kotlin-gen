// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.graph.GraphItemTypes
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.StripeTypes
import yfiles.lang.Predicate

/**
 * Constant class for common serialization properties.
 * @see [IWriteContext.getSerializationProperty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties">Online Documentation</a>
 */

external object SerializationProperties {
  /**
   * The current [String] base URI which is used for the GraphML file being parsed or written.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23BASE_URI">Online Documentation</a>
   */
   val BASE_URI: SerializationPropertyKey<String>
  
  /**
   * Property key to control caching for external references.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23CACHE_EXTERNAL_REFERENCES">Online Documentation</a>
   */
   val CACHE_EXTERNAL_REFERENCES: SerializationPropertyKey<Boolean>
  
  /**
   * The current [KeyScope] in which an [IOutputHandler], [IInputHandler], or custom serialization code is called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23CURRENT_KEY_SCOPE">Online Documentation</a>
   */
   val CURRENT_KEY_SCOPE: SerializationPropertyKey<KeyScope>
  
  /**
   * Property key to control graph element geometry serialization and deserialization
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_GEOMETRY">Online Documentation</a>
   */
   val DISABLE_GEOMETRY: SerializationPropertyKey<GraphItemTypes>
  
  /**
   * Property key to omit serialization and deserialization of the [IGraph][yfiles.graph.IGraph]'s default settings.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_GRAPH_SETTINGS">Online Documentation</a>
   */
   val DISABLE_GRAPH_SETTINGS: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to control graph elements serialization and deserialization
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_ITEMS">Online Documentation</a>
   */
   val DISABLE_ITEMS: SerializationPropertyKey<GraphItemTypes>
  
  /**
   * Property key to control label serialization of [IStripe][yfiles.graph.IStripe]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_STRIPE_LABELS">Online Documentation</a>
   */
   val DISABLE_STRIPE_LABELS: SerializationPropertyKey<StripeTypes>
  
  /**
   * Property key to control style serialization and deserialization of [IStripe][yfiles.graph.IStripe]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_STRIPE_STYLES">Online Documentation</a>
   */
   val DISABLE_STRIPE_STYLES: SerializationPropertyKey<StripeTypes>
  
  /**
   * Property key to control user tag serialization and deserialization of [IStripe][yfiles.graph.IStripe]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_STRIPE_USER_TAGS">Online Documentation</a>
   */
   val DISABLE_STRIPE_USER_TAGS: SerializationPropertyKey<StripeTypes>
  
  /**
   * Property key to control graph element style serialization and deserialization
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_STYLES">Online Documentation</a>
   */
   val DISABLE_STYLES: SerializationPropertyKey<GraphItemTypes>
  
  /**
   * Property key to control user tag serialization and deserialization
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23DISABLE_USER_TAGS">Online Documentation</a>
   */
   val DISABLE_USER_TAGS: SerializationPropertyKey<GraphItemTypes>
  
  /**
   * Property key for storing or setting the id attributes for graph child elements in GraphML.
   * @see [GRAPH_IDS]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23GRAPH_ELEMENT_IDS">Online Documentation</a>
   */
   val GRAPH_ELEMENT_IDS: SerializationPropertyKey<String>
  
  /**
   * Property key for storing or setting the id attributes for `graph` elements in GraphML.
   * @see [GRAPH_ELEMENT_IDS]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23GRAPH_IDS">Online Documentation</a>
   */
   val GRAPH_IDS: SerializationPropertyKey<String>
  
  /**
   * Property key for alllowing to parse member names (properties and enum values) case-insensitively during XAML deserialization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23IGNORE_PROPERTY_CASE">Online Documentation</a>
   */
   val IGNORE_PROPERTY_CASE: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to specify whether to ignore errors during XAML deserialization will be ignored and instead return `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23IGNORE_XAML_DESERIALIZATION_ERRORS">Online Documentation</a>
   */
   val IGNORE_XAML_DESERIALIZATION_ERRORS: SerializationPropertyKey<Boolean>
  
  /**
   * Property key whether the XML output should be properly indented.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23INDENT_OUTPUT">Online Documentation</a>
   */
   val INDENT_OUTPUT: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to specify whether the preferred size of labels should be parsed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23PARSE_LABEL_SIZE">Online Documentation</a>
   */
   val PARSE_LABEL_SIZE: SerializationPropertyKey<Boolean>
  
  /**
   * The edge that is currently being represented by the dummy edge that is written instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23REPRESENTED_EDGE">Online Documentation</a>
   */
   val REPRESENTED_EDGE: SerializationPropertyKey<IEdge>
  
  /**
   * Property key to specify whether to rewrite relative URIs relative to the current document location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23REWRITE_RELATIVE_RESOURCE_URIS">Online Documentation</a>
   */
   val REWRITE_RELATIVE_RESOURCE_URIS: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to control how undefined values are serialized.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23UNDEFINED_HANDLING">Online Documentation</a>
   */
   val UNDEFINED_HANDLING: SerializationPropertyKey<UndefinedHandling>
  
  /**
   * Property key to specify whether to write the default edge style in the &lt;default&gt; element of the key definition.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23WRITE_EDGE_STYLE_DEFAULT">Online Documentation</a>
   */
   val WRITE_EDGE_STYLE_DEFAULT: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to provide a predicate that determines if the preferred size of a label should be written.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23WRITE_LABEL_SIZE_PREDICATE">Online Documentation</a>
   */
   val WRITE_LABEL_SIZE_PREDICATE: SerializationPropertyKey<Predicate<ILabel>>
  
  /**
   * Property key to specify whether to write the default node style in the &lt;default&gt; element of the key definition.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23WRITE_NODE_STYLE_DEFAULT">Online Documentation</a>
   */
   val WRITE_NODE_STYLE_DEFAULT: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to specify whether to write the default port style in the &lt;default&gt; element of the key definition.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23WRITE_PORT_STYLE_DEFAULT">Online Documentation</a>
   */
   val WRITE_PORT_STYLE_DEFAULT: SerializationPropertyKey<Boolean>
  
  /**
   * Property key to specify whether the stripe defaults of a table should be written.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SerializationProperties%23WRITE_STRIPE_DEFAULTS">Online Documentation</a>
   */
   val WRITE_STRIPE_DEFAULTS: SerializationPropertyKey<Boolean>
}
