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
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A label model for group node labels that are placed inside the tab or tab background area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-constructor-GroupNodeLabelModel">Online Documentation</a>
 */
external open class GroupNodeLabelModel  () : ILabelModel, ILabelModelParameterProvider {

/**
 * Gets or sets a value that determines if the label geometry calculated by this model takes the [GroupNodeStyle.tabInset][yfiles.styles.GroupNodeStyle.tabInset] into account.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23considerTabInset">Online Documentation</a>
 */
final var considerTabInset: Boolean
/**
 * Creates a parameter that places labels inside the tab area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle] instance.
 * @return A parameter that places labels inside the tab area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter that places labels inside the tab background area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle].
 * @return A parameter that places labels inside the tab background area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-createTabBackgroundParameter">Online Documentation</a>
 */
 final   fun createTabBackgroundParameter():ILabelModelParameter
/**
 * Returns an empty context.
 * @param [label] The label to use in the context.
 * @param [layoutParameter] The parameter to use for the label in the context.
 * @return An empty context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-getParameters">Online Documentation</a>
 */
 final override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<GroupNodeLabelModel> {
}
}

inline fun GroupNodeLabelModel(
    block: GroupNodeLabelModel.() -> Unit
): GroupNodeLabelModel {
    return GroupNodeLabelModel()
        .apply(block)
}
