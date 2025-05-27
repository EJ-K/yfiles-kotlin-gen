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
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata

/**
 * A label model for group node labels that are placed inside the tab or tab background area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-constructor-GroupNodeLabelModel">Online Documentation</a>
 */
external class GroupNodeLabelModel () : ILabelModel {
  /**
   * Gets or sets a value that determines if the label geometry calculated by this model takes the [tabPadding][yfiles.styles.GroupNodeStyle] into account.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23considerTabPadding">Online Documentation</a>
   */
  final var considerTabPadding: Boolean
  
  /**
   * Creates a parameter that places labels inside the tab background area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle].
   * @return A parameter that places labels inside the tab background area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-createTabBackgroundParameter">Online Documentation</a>
   */
  fun createTabBackgroundParameter(): GroupNodeLabelModelParameter
  
  /**
   * Creates a parameter that places labels inside the tab area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle] instance.
   * @return A parameter that places labels inside the tab area of a [GroupNodeStyle][yfiles.styles.GroupNodeStyle] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-createTabParameter">Online Documentation</a>
   */
  fun createTabParameter(): GroupNodeLabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeLabelModel%23GroupNodeLabelModel-method-getGeometry">Online Documentation</a>
   */
  override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<GroupNodeLabelModel> {
  }
}

inline fun GroupNodeLabelModel(
    block: GroupNodeLabelModel.() -> Unit
): GroupNodeLabelModel {
    return GroupNodeLabelModel()
        .apply(block)
}
