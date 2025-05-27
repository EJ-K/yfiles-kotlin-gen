// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ILookup
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A straightforward implementation of an [IPortLocationModel] for [IPort]s at [INode]s that determine the location dynamically using the [layout][INode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel">Online Documentation</a>
 */
external class FreeNodePortLocationModel private constructor() : IPortLocationModel {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-createParameter">Online Documentation</a>
   */
  override fun createParameter(
    owner: IPortOwner,
    location: Point,
  ): IPortLocationModelParameter
  
  /**
   * Creates a parameter that uses the given ratios and offsets.
   * @param [ratios] The ratios of the node layout's size.
   * @param [offset] The offset that is added after the `ratios` are applied.
   * @return A new parameter that matches the specification.
   * @throws ArgumentError `ratios` or `offset` contains one or more `NaN` values.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-createParameterForRatios">Online Documentation</a>
   */
  fun createParameterForRatios(
    ratios: Point,
    offset: Point  = definedExternally,
  ): FreeNodePortLocationModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    port: IPort,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-getLocation">Online Documentation</a>
   */
  override fun getLocation(
    port: IPort,
    locationParameter: IPortLocationModelParameter,
  ): Point
  
  companion object : ClassMetadata<FreeNodePortLocationModel> {
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the center of the bottom border of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23BOTTOM">Online Documentation</a>
     */
     val BOTTOM: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the bottom left corner of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23BOTTOM_LEFT">Online Documentation</a>
     */
     val BOTTOM_LEFT: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the bottom right corner of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23BOTTOM_RIGHT">Online Documentation</a>
     */
     val BOTTOM_RIGHT: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the center of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23CENTER">Online Documentation</a>
     */
     val CENTER: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable instance of the [FreeNodePortLocationModel].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: FreeNodePortLocationModel
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the center of the left border of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23LEFT">Online Documentation</a>
     */
     val LEFT: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the center of the right border of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23RIGHT">Online Documentation</a>
     */
     val RIGHT: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the center of the top border of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23TOP">Online Documentation</a>
     */
     val TOP: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the top left corner of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23TOP_LEFT">Online Documentation</a>
     */
     val TOP_LEFT: FreeNodePortLocationModelParameter
    
    /**
     * A read only immutable singleton instance of a parameter that locates the port at the top right corner of the node layout.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23TOP_RIGHT">Online Documentation</a>
     */
     val TOP_RIGHT: FreeNodePortLocationModelParameter
  }
}
