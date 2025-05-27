// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A label model for node labels that lie outside of the node's [INode.layout] bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-constructor-ExteriorLabelModel">Online Documentation</a>
 */
external open class ExteriorLabelModel  () : ILabelModel, ILabelModelParameterProvider {

/**
 * Gets or sets the insets to use by this model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23insets">Online Documentation</a>
 */
open var insets: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a new parameter that is associated with this instance for the provided position.
 * @param [position] The position constant that describes the position of the label.
 * @return A new parameter instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-method-createParameter">Online Documentation</a>
 */
 open   fun createParameter( position: ExteriorLabelModelPosition ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-method-getParameters">Online Documentation</a>
 */
 override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23ExteriorLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<ExteriorLabelModel> {
/**
 * A predefined parameter instance that places the label outside the node at the right side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23EAST">Online Documentation</a>
 */
 val EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the top.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23NORTH">Online Documentation</a>
 */
 val NORTH: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the upper right corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23NORTH_EAST">Online Documentation</a>
 */
 val NORTH_EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23NORTH_WEST">Online Documentation</a>
 */
 val NORTH_WEST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the bottom.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23SOUTH">Online Documentation</a>
 */
 val SOUTH: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the lower right corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23SOUTH_EAST">Online Documentation</a>
 */
 val SOUTH_EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the lower left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23SOUTH_WEST">Online Documentation</a>
 */
 val SOUTH_WEST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label outside the node at the left side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExteriorLabelModel%23WEST">Online Documentation</a>
 */
 val WEST: ILabelModelParameter
}
}

inline fun ExteriorLabelModel(
    block: ExteriorLabelModel.() -> Unit
): ExteriorLabelModel {
    return ExteriorLabelModel()
        .apply(block)
}
