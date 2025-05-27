// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Abstract base class for classes that specify custom data for a layout calculation on [IGraph][yfiles.graph.IGraph] instances.
 * @see [LayoutExecutor.layoutData]
 * @see [GraphComponent.morphLayout][yfiles.view.GraphComponent.morphLayout]
 * @see [GenericLayoutData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutData">Online Documentation</a>
 */
external abstract class LayoutData  : YObject {

/**
 * Combines this instance with the given layout data.
 * @param [data] The [LayoutData] to combine this instance with.
 * @return The combined layout data.
 * @see [CompositeLayoutData]
 * @see [GenericLayoutData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutData%23LayoutData-method-combineWith">Online Documentation</a>
 */
 final   fun combineWith(vararg  data: LayoutData ):LayoutData

companion object : ClassMetadata<LayoutData> {
}
}
