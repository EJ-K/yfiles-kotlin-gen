// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A straightforward implementation of an [IPortLocationModel] for [IPort]s at [INode]s that determine the location dynamically using the [INode.layout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel">Online Documentation</a>
 */
external  class FreeNodePortLocationModel 
private constructor () : IPortLocationModel {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-createParameter">Online Documentation</a>
 */
 final override   fun createParameter( owner: IPortOwner ,
 location: Point ):IPortLocationModelParameter
/**
 * Creates a parameter that uses the given ratios and offsets.
 * @param [ratios] The ratios of the node layout's size.
 * @param [offset] The offset that is added after the `ratios` are applied.
 * @return A new parameter that matches the specification.
 * @throws ArgumentError `ratios` or `offset` contains one or more `NaN` values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-createParameterForRatios">Online Documentation</a>
 */
 final   fun createParameterForRatios( ratios: Point ,
 offset: Point?  = definedExternally):IPortLocationModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( port: IPort ,
 locationParameter: IPortLocationModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-getLocation">Online Documentation</a>
 */
 final override   fun getLocation( port: IPort ,
 locationParameter: IPortLocationModelParameter ):Point
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23FreeNodePortLocationModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<FreeNodePortLocationModel> {
/**
 * A read only immutable instance of the [FreeNodePortLocationModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: FreeNodePortLocationModel
/**
 * A read only immutable singleton instance of a parameter that locates the port at the center of the bottom border of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_BOTTOM_ANCHORED">Online Documentation</a>
 */
 val NODE_BOTTOM_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the bottom left corner of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_BOTTOM_LEFT_ANCHORED">Online Documentation</a>
 */
 val NODE_BOTTOM_LEFT_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the bottom right corner of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_BOTTOM_RIGHT_ANCHORED">Online Documentation</a>
 */
 val NODE_BOTTOM_RIGHT_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the center of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_CENTER_ANCHORED">Online Documentation</a>
 */
 val NODE_CENTER_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the center of the left border of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_LEFT_ANCHORED">Online Documentation</a>
 */
 val NODE_LEFT_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the center of the right border of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_RIGHT_ANCHORED">Online Documentation</a>
 */
 val NODE_RIGHT_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the center of the top border of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_TOP_ANCHORED">Online Documentation</a>
 */
 val NODE_TOP_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the top left corner of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_TOP_LEFT_ANCHORED">Online Documentation</a>
 */
 val NODE_TOP_LEFT_ANCHORED: IPortLocationModelParameter
/**
 * A read only immutable singleton instance of a parameter that locates the port at the top right corner of the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodePortLocationModel%23NODE_TOP_RIGHT_ANCHORED">Online Documentation</a>
 */
 val NODE_TOP_RIGHT_ANCHORED: IPortLocationModelParameter
}
}
