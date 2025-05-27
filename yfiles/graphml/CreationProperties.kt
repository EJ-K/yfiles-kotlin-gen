// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IEnumerable
import yfiles.collections.MapEntry
import yfiles.geometry.Rect
import yfiles.graph.IPortLocationModelParameter
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata

/**
 * A mutable implementation of [IMapper][yfiles.collections.IMapper] that is typed for [Object] keys and values.
 * @see [IGraphElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23CreationProperties-constructor-CreationProperties">Online Documentation</a>
 */
external class CreationProperties ()  {
  /**
   * Gets all the entries stored by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23entries">Online Documentation</a>
   */
  final val entries: IEnumerable<MapEntry<CreationPropertyKey<*>, Any>>
  
  /**
   * Clears all entries from this property store.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23CreationProperties-method-clear">Online Documentation</a>
   */
  fun clear()
  
  /**
   * Gets the value associated with the specified key.
   * @param [key] The key.
   * @return The value stored for the key.
   * @see [set]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23CreationProperties-method-get">Online Documentation</a>
   */
  operator fun <T : Any> get(
    key: CreationPropertyKey<T>,
  ): T?
  
  /**
   * Removes the associated entry for the given key.
   * @param [key] The entry key to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23CreationProperties-method-removeValue">Online Documentation</a>
   */
  fun removeValue(
    key: CreationPropertyKey<*>,
  )
  
  /**
   * Sets the value associated with the specified key.
   * @param [key] The key.
   * @param [value] The value stored for the key.
   * @see [get]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23CreationProperties-method-set">Online Documentation</a>
   */
  operator fun <T : Any> set(
    key: CreationPropertyKey<T>,
    value: T,
  )
  
  companion object : ClassMetadata<CreationProperties> {
    /**
     * Creation property key that tags bend information.
     * @see [IGraphElementFactory.createEdge]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23BENDS">Online Documentation</a>
     */
     val BENDS: CreationPropertyKey<IEnumerable<*>>
    
    /**
     * Creation property key that tags group node information.
     * @see [IGraphElementFactory.createNode]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23IS_GROUP_NODE">Online Documentation</a>
     */
     val IS_GROUP_NODE: CreationPropertyKey<Boolean>
    
    /**
     * Creation property key that tags label information.
     * @see [IGraphElementFactory]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23LABELS">Online Documentation</a>
     */
     val LABELS: CreationPropertyKey<IEnumerable<*>>
    
    /**
     * Creation property key that tags node layout information.
     * @see [IGraphElementFactory.createNode]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23LAYOUT">Online Documentation</a>
     */
     val LAYOUT: CreationPropertyKey<Rect>
    
    /**
     * Creation property key that tags [port location][IPortLocationModelParameter] information.
     * @see [IGraphElementFactory.addPort]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23PORT_LOCATION_MODEL_PARAMETER">Online Documentation</a>
     */
     val PORT_LOCATION_MODEL_PARAMETER: CreationPropertyKey<IPortLocationModelParameter>
    
    /**
     * Creation property key that tags style information.
     * @see [IGraphElementFactory]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23STYLE">Online Documentation</a>
     */
     val STYLE: CreationPropertyKey<Any>
    
    /**
     * Creation property key that tags [tag][yfiles.collections.ITagOwner] object information.
     * @see [IGraphElementFactory]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreationProperties%23TAG">Online Documentation</a>
     */
     val TAG: CreationPropertyKey<Tag>
  }
}
